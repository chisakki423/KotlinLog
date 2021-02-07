package jp.techacademy.chisaki.yoshioka.kotlinlog
//ファイルのクラスがどのパッケージに属しているかを示す

//上記以外のパッケージに属するクラスを使用することを宣言
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//android.utilパッケージのLogクラスを使用

//class 新規クラス名 : 継承元のクラス() {
class MainActivity : AppCompatActivity() {
    //親クラスAppCompatActivityのプロパティや関数を引き継いでいる MainActiviyクラスを定義する

    //[override] 略[アクセスコントロール] fun 関数名(引数) 略[: 戻り値の型] {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 15,"ゲーム")
        human.say()
        human.think()

        val human2 = Human("次郎",17,"スポーツ")
        human2.say()
        human2.think()



    }
    
}