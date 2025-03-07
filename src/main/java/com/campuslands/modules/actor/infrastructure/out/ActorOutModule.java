package com.campuslands.modules.actor.infrastructure.out;

import com.campuslands.modules.actor.aplication.ActorService;
import com.campuslands.modules.actor.infrastructure.in.ActorAdapter;

public class ActorOutModule {


    protected ActorMySQL MySQL;
    protected ActorService service;
    protected ActorAdapter adapter;

    public ActorOutModule() {
        MySQL = new ActorMySQL();
        service = new ActorService(MySQL);
        adapter = new ActorAdapter(service);

    }

    public ActorAdapter module() {
        return adapter;
    }

    
}
