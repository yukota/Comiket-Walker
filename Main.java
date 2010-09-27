
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*データ生成*/
		//マップデータ
		Map mapData =  new  Map();
		
		
		//マップデータロード
		mapData.loadMap();
		
		
		
		//ウインドウの作成
		Monitor monitor = new Monitor();
		//マップデータの描写
		monitor.showInitMap(mapData);
		
		//ゴールポイントの指定:巡回するサークル
		MapPoint [] mpGoal = new MapPoint[3];
		monitor.selectGoal(mpGoal);
		
		Findpath findpath = new Findpath(mapData,mpGoal);
		
		
		
		
	}

}
