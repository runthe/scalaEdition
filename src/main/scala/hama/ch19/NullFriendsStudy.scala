package hama.ch19


/**
  * Null  –  Trait 이다. 모든 참조 타입(AnyRef를 상속한 모든 클래스) 의 서브클래스이다. 값 타입과는 호환성이 없다.
  * null  –  Null 의 인스턴스이고 자바의 null 가 비슷. val i : Int = null; 불가능 (값 타입과 호환성 없다)
  * Nothing - Trait 이며 모든것들의 서브타입이다.기술적으로 예외는 Nothing 타입을 갖는다. 이 타입은 값이 존재하지 않는다. 값에 대입이 가능하다. 즉  리턴타입이 Int 인 메소드에서 리턴을 Nothing 타입인 예외를 던질 수 있다.
  * Nil    –  아무것도 없는 List 를 나타낸다.
  * None – 아무것도 없다는 리턴 값을 표현하기 위해 사용된다. null 포인트 예외를 회피하기 위해 Option[T] 의 자식클래스로 사용된다.
  * Unit  – 아무 값도 리턴 하지 않는 메소드의 리턴타입으로 사용.
  * 출처: http://hamait.tistory.com/652 [HAMA 블로그]
  *
  *
  **/