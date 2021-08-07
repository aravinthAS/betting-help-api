package org.ara.betting.service;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class BettingServiceImpl implements BettingService {

    @Override
    public Response getBettingNumberByRandom(int fromNumber, int toNumber, int antallNumber) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < antallNumber; i++) {
            int randomNumber = random.nextInt(toNumber);
            if(randomNumbers.contains(randomNumber) || randomNumber < fromNumber){
                i--;
            }
            randomNumbers.add(randomNumber);
        }
        return Response.ok(randomNumbers.toString()).build();
    }

}
