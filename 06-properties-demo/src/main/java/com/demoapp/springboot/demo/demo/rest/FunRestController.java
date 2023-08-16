package com.demoapp.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose a "/" endpoint that returns "Hello, World!"

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello, World!</h1>";
    }

    // expose new endpoint for /workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "<h1>Run a hard 5k!</h1>";
    }

    // expose a new endpoint for /workout/id
    @GetMapping("/workout/{id}")
    public String getSingleWorkout(@PathVariable("id") int workoutId) {
        return "<h1>This is the id " + workoutId + "</h1>";
    }

    // expose a new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "<h1>Coach name: " + coachName + " and the team: " + teamName + "</h1>";
    }
}
