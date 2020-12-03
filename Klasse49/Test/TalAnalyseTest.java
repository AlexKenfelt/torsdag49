public class TalAnalyseTest {
    public void getNumbersAboveavg(){
        Talanalyse talanalyse = new Talanalyse();
        int [] jenbo = {1,2,3,4,5,6,7,8,9};
        talanalyse.getNumbersAboveAvg(jenbo);
        int expected = 123;
        assertEquals(expected,actual);
    }
}
