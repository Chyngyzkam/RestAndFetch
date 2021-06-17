package com.peaksoft.spring_bootcrudsucurity2.controller;


import com.peaksoft.spring_bootcrudsucurity2.entity.User;
import com.peaksoft.spring_bootcrudsucurity2.service.RoleService;
import com.peaksoft.spring_bootcrudsucurity2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class RestController1 {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public RestController1(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<User>>getAll() {
        try {
            return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{byId}")
    public ResponseEntity<User>getById(@PathVariable("byId") Long userId){
        try {
            return new ResponseEntity<>(userService.getById(userId), HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


   @PostMapping
   public ResponseEntity<User>save(@RequestBody User user){
        try {
            return new ResponseEntity<>(userService.addUser(user),HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
   }

    @PutMapping
    public ResponseEntity<User>update(@RequestBody User user){
        try {
            return  new ResponseEntity<>(userService.updateUser(user),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/{byId}")
    public ResponseEntity<User>delete(@PathVariable("byId") long userId){
        try {
            userService.deleteById(userId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


//    @PostMapping
//    public ResponseEntity<User>addUser(@RequestBody User user){
//        try{
//            return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }

//    @PutMapping
//    public ResponseEntity<User>update(@RequestBody User user){
//        try{
//            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }


//    @DeleteMapping("/{userId}")
//    public ResponseEntity<User>delete(@PathVariable("userId") Long userId){
//        try{
//            userService.deleteUser(userId);
//            return new ResponseEntity (HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }


//    @GetMapping("/info")
//    public ResponseEntity infoPerson(Principal principal){
//        try{
//            return new ResponseEntity(this.userService.loadUserByUsername(principal.getName()),HttpStatus.OK);
//        }catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
    }


