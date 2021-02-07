package jp.techacademy.chisaki.yoshioka.kotlinlog

import android.util.Log

open class Human:Animal {

    var hobby:String

    constructor(name: String, age: Int, hobby: String):super(name,age){

        this.hobby=hobby
    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    fun think(){
        Log.d("kotlintest","私は" + this.hobby + "について考える。")
    }

}