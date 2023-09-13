package org.example.test.BaseTest;
import org.example.test.BasePO.GooglePO;
import org.example.test.Rota.Rota;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
public class BaseTest extends Rota {
    private static GooglePO googlePage;

    @BeforeClass
    public static void inicializaPagina(){
        googlePage = new GooglePO(chrome);
    }
    @Test
    public void TesteWebDriver() {
        googlePage.inputPesquisa.sendKeys("brics venezuela"+ Keys.ENTER);
        String data = googlePage.resultadoPesquisa.getText();
        System.out.println(data);
        Assert.assertTrue(data.contains("Aproximadamentee"));
    }
}
