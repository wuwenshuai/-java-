package cn.carryshuai.one.设计模式.策略模式;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/26 09:33
 * @Description:
 */
public class Content {

    private StagePrice stagePrice;

    public Content(StagePrice stagePrice) {
        this.stagePrice = stagePrice;
    }

    public void setStagePrice(StagePrice stagePrice) {
        this.stagePrice = stagePrice;
    }

    public StagePrice getStagePrice() {
        return stagePrice;
    }
    public void printPrice(double price){
        System.out.println("你需要付的钱："+stagePrice.getPrice(price));
    }
}
