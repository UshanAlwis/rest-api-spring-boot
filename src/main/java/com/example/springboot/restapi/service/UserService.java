package com.example.springboot.restapi.service;

import com.example.springboot.restapi.dto.UserDataTransferObject;
import com.example.springboot.restapi.entity.User;
import com.example.springboot.restapi.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserDataTransferObject SaveUser(UserDataTransferObject userDataTransferObject){
        userRepository.save(modelMapper.map(userDataTransferObject, User.class));
        return userDataTransferObject;
    }
    public List<UserDataTransferObject> getAllUsers(){
        List<User>userList=userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDataTransferObject>>(){}.getType());
    }
    public UserDataTransferObject  updateUser(UserDataTransferObject userDataTransferObject){
        userRepository.save(modelMapper.map(userDataTransferObject , User.class));
        return userDataTransferObject;
    }

}
