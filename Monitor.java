import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.*;


public class Monitor {
	//configure
	final int iFrameWidthNum = 20;
	final int iFrameHeightNum = 20;
	JPanel [][] pnlM = new JPanel[iFrameHeightNum][iFrameWidthNum];
	JFrame frame = new JFrame("MapState");
	
	//コンストラクタ
	public Monitor(){
		//フレームの作成
//		JFrame frame = new JFrame("MapState");
		frame.setBounds(150,150,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//マス目の設定
		frame.setLayout(new GridLayout(iFrameHeightNum,iFrameWidthNum));
		
		
		
		//パネル描写
//		JPanel [][] pnlM = new JPanel[iFrameHeightNum][iFrameWidthNum];
		for(int iHeight = 0;iHeight < iFrameHeightNum ;iHeight++){
			for(int iWidth = 0;iWidth < iFrameWidthNum ;iWidth++){
				
				pnlM[iHeight][iWidth] = new JPanel();
				pnlM[iHeight][iWidth].setPreferredSize(new Dimension(10,10));
				pnlM[iHeight][iWidth].setBackground(Color.BLACK);
				frame.add(pnlM[iHeight][iWidth]);
			}
		}
				pnlM[1][1].setBackground(Color.white);
		
		frame.setVisible(true);
		
	}
	
	/*loadクラス 初期マップ状態をロードする*/
	//map状態:0通路、1出入口、2ブース、3壁
	public void showInitMap(Map mapData){
		for(int iHeight = 0;iHeight <iFrameHeightNum;iHeight++){
			for(int iWidth =0;iWidth<iFrameWidthNum;iWidth++){
				switch (mapData.mapState(iHeight, iWidth)){
				case 0:
					pnlM[iHeight][iWidth].setBackground(Color.WHITE);
					break;
				case 1:
					pnlM[iHeight][iWidth].setBackground(Color.RED);
					break;
				case 2:
					pnlM[iHeight][iWidth].setBackground(Color.BLUE);
					break;
				case 3:
					pnlM[iHeight][iWidth].setBackground(Color.BLACK);
					break;
				
				}
				
				
			}
			
		}
		
		frame.setVisible(true);
	}
	
	/*selectGoalクラス目的地の設定 */
	public void selectGoal(MapPoint mpGoal[]){
		//めんどくせーので決め打ち。
		mpGoal[0].y =10;
		mpGoal[0].x =8;
		
		mpGoal[1].y =10;
		mpGoal[1].x =8;
		
		mpGoal[2].y =10;
		mpGoal[2].x =8;
	}
	
}
