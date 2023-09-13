package org.example.test.BasePO;

import org.example.test.BasePO.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement resultadoPesquisa;

    public GooglePO(WebDriver chrome) {
        super(chrome);
    }


}
