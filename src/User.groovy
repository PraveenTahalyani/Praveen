/**
 * Created by praveen on 8/6/16.
 */

println "hello world"
List a=[2,3,4,5,6]
if(a)
{
    println("the a is not empty")
}
String b=""
if(b)
{
    println"b is not empty"
}
else{
    println"b is empty"
}
Map data=[firstName: "Praveen" ,lastName:"tahalyani",info:"I mis the class"]
println data
println data.firstName
println data.get("firstName")
println(data["firstName"])
String c="Praveen"
String d="Tahalyani"
println "hello ${c},${d}"

println("In groovy")
a.each{
    println it
}
a.each{ marks->
    println(marks)

}

