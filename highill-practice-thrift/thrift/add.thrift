namespace java com.highill.practice.thrift

service AddService {

  i32 addInteger(1:i32 param1, 2:i32 param2)
 
  i64 addLong(1:i64 param1, 2:i64 param2)
   
  string addString(1:string param1, 2:string param2)
}