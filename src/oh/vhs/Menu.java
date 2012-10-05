package oh.vhs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity {
	
	private Intent playIntent; //　プレイ画面へ投げるインテント宣言
	private Intent optionIntent; //　オプション画面へ投げるインテント宣言
	private Intent creditIntent; //　クレジット画面に投げるインテント宣言
	private Intent scoreIntent; //　スコア画面に投げるインテント宣言
	private int level; //　ゲーム難易度を保持しておく変数　0易 1普 2難

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // Button 宣言
        Button startbutton = (Button) this.findViewById(R.id.startButton);	// start
        Button optionbutton = (Button) this.findViewById(R.id.optionButton);// option
        Button staffbutton = (Button) this.findViewById(R.id.staffButton);	// staff
        Button scorebutton = (Button) this.findViewById(R.id.scoreButton);	// score
        
        startbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		startbutton_OnClick();
        	}
        });
        optionbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		optionbutton_OnClick();
        	}
        });
        staffbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		staffbutton_OnClick();
        	}
        });
        scorebutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		scorebutton_OnClick();
        	}
        });
    }
    
    private void startbutton_OnClick(){
    	// ここに遷移イベント
    	
    	//　仮のイベント
    	AlertDialog.Builder teststart = new AlertDialog.Builder(Menu.this);
    	teststart.setTitle("スタートしました？");
    	teststart.setMessage("画面遷移イベントとなります");
    	teststart.show();
    }
    
    private void optionbutton_OnClick(){
    	// ここに遷移イベント
    	
    	//　仮のイベント
    	AlertDialog.Builder testoption = new AlertDialog.Builder(Menu.this);
    	testoption.setTitle("オプチォン？");
    	testoption.setMessage("プギィッ！");
    	testoption.show();
    }
    
    private void staffbutton_OnClick(){
    	// ここに遷移イベント
    	
    	//　仮のイベント
    	AlertDialog.Builder teststaff = new AlertDialog.Builder(Menu.this);
    	teststaff.setTitle("アラド戦記へようこそ！");
    	teststaff.setMessage("残念ながらあなたのアカウントは凍結されています");
    	teststaff.show();
    }

    private void scorebutton_OnClick(){
    	// ここに遷移イベント
    	
    	//　仮のイベント
    	AlertDialog.Builder testscore = new AlertDialog.Builder(Menu.this);
    	testscore.setTitle("Keep が R_id を倒しました");
    	testscore.setMessage("Keep 22kill 1dead 36541damage");
    	testscore.show();
    }
}
