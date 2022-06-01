package com.homeworkwallet.publicapp;

import com.homeworkwallet.library.dto.CardDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("public")
public class PublicAppRestController {

    private final CardService cardService;

    public PublicAppRestController(CardService cardService) {
        this.cardService = cardService;
    }

    /*
    TODO
    - request definition for create (PUT mapping)
    - request definition for update (POST mapping)
    - request definition for remove (DELETE mapping)

    with parameters for "remove" and body (not string, but CardDetails) for create and update

    keep in mind:
    - each of those requests should call some method in CardService
    - each of those request should return something (created/updated/deleted instance as response)
    - response should be mocked for now, while you haven't implemented it yet (as in CardService#getCardDetailsByNumber now)
    */

    @PutMapping
    public CardDetails create(@RequestBody CardDetails cardDetails) {
        return cardService.createCardDetails(cardDetails);
    }

    @DeleteMapping
    public CardDetails delete(@RequestParam(name = "cardNumber") String cardNumber) {
        return cardService.deleteUser(cardNumber);
    }

    @PostMapping
    public CardDetails update(@RequestBody CardDetails cardDetails)  {
        return cardService.updateCardDetails(cardDetails);
        }

    @GetMapping
    public CardDetails get(@RequestParam(name = "cardNumber") String cardNumber) {
        return cardService.getCardDetailsByNumber(cardNumber);
    }
}
