class StateEffect{
//  private int nowState;
//今どの状態異常にかかっているか
  private int PARALYSIS = 1;
  private int NOMAL = 0;
  State nowState;

  //通常状態で初期化する
  StateEffect(){
    nowState = new NomalState();
  }
  //状態異常にかかったか
  void setStateEffect(int x){
    if(x==PARALYSIS){
      nowState = new Paralysis();
    }else {
      nowState = new NomalState();
    }
  }
  //状態異常を返す
  boolean getStateEffect(){
    return nowState.getTime();
  }
  //状態異常を返す
  boolean checkStateEffect(){
    return nowState.checkTime();
  }
}
