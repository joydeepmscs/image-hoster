package imagehoster.controller;

import imagehoster.model.Comment;
import imagehoster.model.Image;
import imagehoster.model.User;
import imagehoster.service.CommentService;
import imagehoster.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private ImageService imageService;


    @RequestMapping(value="/image/{imageId}/{title}/comments", method = RequestMethod.POST)
    public String newComment(@PathVariable("imageId") Integer imageId, @PathVariable("title") String title, @RequestParam("comment") String commentText, HttpSession session) {
        Comment newComment= new Comment();
        Image image = imageService.getImage(imageId);
        User user= (User) session.getAttribute("loggeduser");
        newComment.setText(commentText);
        newComment.setUser(user);
        newComment.setImage(image);
        newComment.setCreatedDate(LocalDateTime.now());
        commentService.createComment(newComment);
        return "redirect:/images/"+imageId+"/"+title;
    }
}