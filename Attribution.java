class Attribution{
  //定数
  public static final int TOTAL_ATTRIBUTION = 3; //属性の総数
  //属性を数字で表す
  public static final  int FIRE=0;
  public static final int WATER=1;
  public static final int WIND=2;

  //変数
  private int attribution;

  //ランダムに属性決定
  Attribution(){
    int rand = (int)(Math.random() * TOTAL_ATTRIBUTION-1);
    if(rand == FIRE){
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
