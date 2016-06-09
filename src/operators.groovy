/**
 * Created by praveen on 9/6/16.
 */
List a=[2,43,4,76,7,2,40,50,32,34]
List b=[]
a.each{ item->
    if(item > 20)
    {
        b.push(item)
        println item

    }

}
b.each{
    print it
}

println a.find{ xyz->
    return xyz>20
}
println a.findAll {
    return it>20
}