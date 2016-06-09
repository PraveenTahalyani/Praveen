
class Program1{
    String firstName
    String lastName
    String email
    int age

}

Map m1=[firstName: "Praveen" ,lastName:"tahalyani",email:"praveen.tahalyani",age:21]
Map m2=[firstName: "Piku" ,lastName:"kumar",email:"piku.kumar",age:20]

Program1 p1=new Program1(m1)
Program1 p2=new Program1(m2)
List a=[p1,p2]

a.each{
    println "${it.firstName} ${it.lastName} (${it.age})"
}