// 좀 짧다 import 덜 하고 System.out 이런 거 덜 써도 됨
// (모든 게 다 클래스 안에 있어야만 되는 건 아님)
println("hello")

1 + 2

"hello" + " " + "world"

// 이름을 정의할 때 타입을 적어주지 않아도 추측한다
// (자바 10부터는 var라는 똑같은 키워드가 자바에도 추가)
var n = 1 + 2
var s = "hello"

n
s

n + s.length

// 필요하면 : 하고 뒤에 타입을 적어줘도
// 자바보다 간단한 점 하나 더 기본타입 int인지 그걸 감싸안은 Integer 오브젝트 타입인지
// 그런 거 생각할 필요 없이 그냥 Int로 쓰면 된다
var n1 : Int = 2 + 3
var s2 : String = "world"



// 기본 라이브러리에서 순서쌍 지원
Pair(1,2)
Pair(3,"hello")
Pair(Pair("hello",3),Pair("world",4))

var p1 = Pair(Pair("hello",3),Pair("world",4))
p1.first
p1.second

// 자바의 final에 해당하는 val
var x1 = 3
x1
x1 = 4
x1
val x2 = 5
// x2 = 3

var p2 = Pair(1,2)
p2
p2 = Pair(3,4)
p2
// p2.first = 7

val p3 = Pair(1,2)
// p3 = Pair(3,4)

// 하지만 코틀린이라고 다 이상적인 게 아니다
// 자바와 데이타 호환성을 위해 Array는 자바의 배열과 거의 같게 동작하기 때문에
// 자바컬렉션프레임워크의 List에 해당하는 걸로 바꿔줘야만 사람이 쓰기 편하게 출력됨
var arr1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
println(arr1.toList())

var arr2 = Array( 5, {i -> i+1}) // 인덱스를 받아 해당 위치의 값을 계산해주는 함수
println(arr2.toList())

var arr3 = Array( 5, {i -> (i+1)*(i+1)}) // 인덱스를 받아 해당 위치의 값을 계산해주는 함수
println(arr3.toList())

// 기본 타입에 특화된 배열들도 제공됨
String( CharArray(3, { _ -> '*'}) )

// 별 개수가 1에서 시작해서 하나씩 늘어나는 배열
var arr4 = Array( 5, { i -> String( CharArray(i+1, { _ -> '*'}) ) })
println(arr4.toList())

arr1.toList().filter( { x -> x%2==0 } )
arr1.toList().map( { x -> x*x*x } )

// 위에 것을 연달아서 쓰면 짝수만 골라서 골라진 것들을 모두 세제곱한 결과를 모아놓으면
arr1.toList().filter( { x -> x%2==0 } ).map( { x -> x*x*x })

// [1,2,3]과 [a,b,c]를 zip하면 [(1,a),(2,b),(3,c)]
var arrX = arrayOf(1,2,3)
var arrY = arrayOf("a","b","c")
arrX.zip(arrY)
arrY.zip(arrX)

// [(1,a),(2,b),(3,c)]를 unzip하면 ([1,2,3],[a,b,c])
val arr5 = arrayOf( Pair(1,"a"), Pair(2,"b"), Pair(3,"c") )
println(arr5.toList())
arr5.unzip()
arr5.unzip().first
arr5.unzip().second
