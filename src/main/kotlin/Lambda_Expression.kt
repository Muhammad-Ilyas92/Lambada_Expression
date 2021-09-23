//LAMBDA EXPRESSION
// Lambda aik annonymous function hote hein jonka koi naam nh h



/*
Hm kotlin m function ko aese define krte hein
fun sum (a: Int , b: Int): Int
{
    return a+b
}
*/



/*
jb k agr hm isse ka LAMBDA banayen to aese hoga
val sum =
    {
            a: Int , b: Int  -> a +b
    }
*/


fun main ()
{
    // y neeche aik aesa function type h jo input Int lega or uska return type b Int he hoga
    var fn : (a: Int, b: Int) -> Int = ::sum






    // yahan aik lambda function banatay hein
    //y aik aesa function h jiska koi naam nh h, y 2 paramter input me lega (x & y) or iski body lambda expression( -> ) k baad shuru ho rhe h, yani y (x+y) kr k return kr dega
    //this is single line lambda
    val lambda1 =  {x: Int , y: Int -> x + y}






    //hm yahan aik multi line lambda banatay hein
    //iski body mein jo iski sb s last line wala expression hoga uska jo data type hoga wohe wohe uska return type hoga, jaise k is m string iska data type h  "Hello ilyas"
    val multilinelambda = {
        println("Hello Lambda")
        val a = 2+3
        "Hello ilyas"
        2
        // yahan p m n iska akhri expression aik Integer rkha
    }

   // multilinelambda() //is s iska output ayega
    println(multilinelambda())  //y output m apna last expression dikhayega, yani y INT = 2 RETURN KR RHA





    //aik or variation dekhte hein lambda ka
    //y sirf aik input lega, or iska jo return type hoga wo X ka miltiple hoga
     val singleParamLambda = {
         x: Int -> x * x
     }
    //yahan pr m aik lambda ka function type declare kr deta hun, jo input m integer lega or return m integer he dega
    //is m type declaration nh kr rahe.
    //this is another procedure how to express single param lambda
    val singleParamLamba2: (Int)-> Int = { x -> x*x }



    //hm yahn aik r lambda define krte hein jo string return krega
    //is m string kuch b return nh kr rha jbh iska datatype unit hoga
    val sayHi = {
        msg: String -> println("Hello $msg ")
    }
    // hm yahan iska datatype explicity b define kr skte hien, q k iska b data type UNIT h
    val sayHi2: (String) -> Unit = {

            msg -> println("Hello $msg ")
    }



    // yahan hm n aik simple param bnyaa jo aik Integer lega or return m b aik integer dega with addition
    val singleParam : (Int) -> Int  = { x -> x + x }
    //isse form ko hm mazeed simplify kr skte hien
    //kotlin m hamare pas aik variable hota h (it) name ka, jo single paramter ko he point krta h to hm (it) ko directly iski body m he use kr skte hein
    val simplifySingleParam: (Int) -> Int =  { it + it }



    //yahan hm ab calculator wale function ka use krengay
  /*     calculator1 (1, 2, {a, b -> a + b })  // y hamein yellow error d rha iska mtlb y h k hm pehle lambda expression small brakcet m use kr rhe the       */
    //kotlin kehta h k agr apka lambda expression akhir m define h to ap usko bahir b define kr skte ho 
  calculator1(1 , 2) {
      a , b -> a + b   //agr hm calculator function ko dekhen to OP hamara last function h to hm us function ko aese use krengay,
  }

}

fun sum (a:Int , b: Int): Int = a + b


// y hm n aik claculator ka function type h jis m function k andr function hai
//op : (Int, Int) -> Int  , y aik lambda function h jo calculator k function  k andr h jo 2 Int type hein or y return b INT he krega

fun calculator1 (a: Int,b: Int , op : (Int, Int) -> Int ) : Int
{
    return  op(a,b)
}