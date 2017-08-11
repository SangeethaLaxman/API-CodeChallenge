package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeChallengeController {

    @RequestMapping("/Hello")
    public CodeChallenge Hello(){
        return new CodeChallenge();
    }
}