package com.galvanize.playground;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lesson")
 public class LessonController {

    public LessonRepository repository;

    public LessonController(LessonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<Lesson> all()
    {
        System.out.println("Inside All Method ");
        return this.repository.findAll();
    }

    @PostMapping("")
    public Lesson save (@RequestBody Lesson lesson )
    {
        System.out.println("inside create");
        try{
           return this.repository.save(lesson);

        }catch (Exception e)
        {
            System.out.println("Exceptin is "+e);
        }
        return null;

    }

}
