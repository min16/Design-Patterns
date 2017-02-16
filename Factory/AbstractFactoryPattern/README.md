#Abstract Factory Pattern
>인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있다. 
객체 구성을 활용해 인터페이스에서 선언한 메소드들에서 구현된다.
구상 클래스에 직접 의존하지 않고도 서로 관련된 객체들로 이루어진 제품군을 만들기 위한 용도로 쓰인다.

##PizzaIngredientFactory
>지역별 원재료가 다르다. 
팩토리 메소드는 지역별로 피자종류를 클래스로 다 가지고있었지만
추상 팩토리는 원재료를 객체로 만들어 생성하는 PizzaIngredientFactory가 있다.
그러므로 뉴욕피자매장에서 피자를 만들면 뉴욕 원재료(NYIngredientFactory)로 피자믈 만들고,
시카고피자매장에서 피자를 만들면 시카고 원재료로(ChicagoIngredientFactory) 피자를 만든다.

