package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControllerAPI {

    public ArrayList<Inscription> inscriptionArrayList= new ArrayList<>();




        @PostMapping(value = "/api/inscription")
        public void AddList(@RequestBody Inscription inscription){
            this.inscriptionArrayList.add(inscription);
        }




        @GetMapping(value = "/api/travels")
        public ArrayList<Travels> getTravels(@RequestParam String userName){
            ListTravels listTravels = new ListTravels();
            Travels travels = new Travels("Algérie", 30);
            listTravels.listTravels.add(travels);
            return listTravels.listTravels;
        }




}
