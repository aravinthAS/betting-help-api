package org.ara.betting.service;

import javax.ws.rs.core.Response;

public interface BettingService {
    Response getBettingNumberByRandom(int fromNumber, int toNumber, int antallNumber);
}
