package com.example.tinycian.controllers;

import com.example.tinycian.service.AgencyService;
import com.example.tinycian.service.AgentService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainPage {


    @RequestMapping(method = RequestMethod.GET)
    public String getMainPage(Model model) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();


        return "mainPage";
    }

}
