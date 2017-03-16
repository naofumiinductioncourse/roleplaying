class Attribution{
  //属性を数字で表す
  private int FIRE=0;
  private int WATER=1;
  private int WIND=2;
  private int attribution;
  public static final int TOTAL_ATTRIBUTION = 3;

  //ランダムに属性決定
  Attribution(){
    int rand = (int)(Math.random()*TOTAL_ATTRIBUTION);
    if(rand==FIRE){
      attribution = FIRE;
    }else if(rand == WATER){
      attribution = WATER;
    }else{
      attribution = WIND;
    }
  }
  //属性を返す
  int getAttribution(){
    return attribution;
  }
}
