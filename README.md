# 软件设计模式-详细讲解（pdf文档说明和代码示例）

## 1、项目介绍
&emsp;&emsp;软件设计模式（Software Design Pattern），又称设计模式，是一套被反复使用、多数人知晓
的、经过分类编目的、代码设计经验的总结。它是解决特定问题的一系列套路，是前辈们的代码设计经验的总
结，具有一定的普遍性，可以反复使用。 

&emsp;&emsp;本项目是通过代码示例的方式，讲解：
- 工厂方法模式
- 抽象工厂模式
- 原型模式
- 建造者模式 

&emsp;&emsp;本项目文字描述等资料在项目根目录的pdf文件夹下。


## 2、开发环境

- 语言：Java 8

- Eclipse/IDEA

- 依赖管理：Maven


## 3、项目目录

├─pattern  
│&emsp; ├─builder  &emsp;//建造者模式  
│&emsp; │ ├─demo1  
│&emsp; │ │&emsp;  Bike.java  
│&emsp; │ │&emsp;  Builder.java  
│&emsp; │ │&emsp;  Client.java  
│&emsp; │ │&emsp;  Director.java  
│&emsp; │ │&emsp;  MobileBuilder.java  
│&emsp; │ │&emsp;  OfoBuilder.java  
│&emsp; │ │&emsp;  
│&emsp; │ └─demo2  
│&emsp; │&emsp;&emsp;      Client.java  
│&emsp; │&emsp;&emsp;     Phone.java  
│&emsp; │&emsp;      
│&emsp; ├─factory  
│&emsp; │ ├─abstract_factory  &emsp;//抽象工厂模式  
│&emsp;  │ │&emsp;  AmericanCoffee.java  
│&emsp;  │ │&emsp;  AmericanDessertFactory.java  
│&emsp;  │ │&emsp;  Client.java  
│&emsp;  │ │&emsp;  Coffee.java  
│&emsp;  │ │&emsp;  Dessert.java  
│&emsp;  │ │&emsp;  DessertFactory.java  
│&emsp;  │ │&emsp;  ItalyDessertFactory.java  
│&emsp;  │ │&emsp;  LatteCoffee.java  
│&emsp;  │ │&emsp;  MatchaMousse.java  
│&emsp;  │ │&emsp;  Trimisu.java  
│&emsp;  │ │&emsp;  
│&emsp; │ ├─before    &emsp;//不使用工厂模式的实现  
│&emsp;  │ │&emsp;  AmericanCoffee.java  
│&emsp;  │ │&emsp;  Client.java  
│&emsp;  │ │&emsp;  Coffee.java  
│&emsp;  │ │&emsp;  CoffeeStore.java  
│&emsp;  │ │&emsp;  LatteCoffee.java  
│&emsp;  │ │&emsp;  
│&emsp; │ ├─config_factory    &emsp;//工厂方法模式 + 配置文件  
│&emsp;  │ │&emsp;  AmericanCoffee.java  
│&emsp;  │ │&emsp;  Client.java  
│&emsp;  │ │&emsp;  Coffee.java  
│&emsp;  │ │&emsp;  CoffeeFactory.java  
│&emsp;  │ │&emsp;  LatteCoffee.java  
│&emsp;  │ │&emsp;  
│&emsp; │ ├─factory_method  &emsp;//工厂方法模式  
│&emsp;  │ │&emsp;  AmericanCoffee.java  
│&emsp;  │ │&emsp;  AmericanCoffeeFactory.java  
│&emsp;  │ │&emsp;  Client.java  
│&emsp;  │ │&emsp;  Coffee.java  
│&emsp;  │ │&emsp;  CoffeeFactory.java  
│&emsp;  │ │&emsp;  CoffeeStore.java  
│&emsp;  │ │&emsp;  LatteCoffee.java  
│&emsp;  │ │&emsp;  LatteCoffeeFactory.java  
│&emsp;  │ │&emsp;  
│&emsp; │ ├─simple_factory  &emsp;//简单工厂模式  
│&emsp;  │ │&emsp;  AmericanCoffee.java  
│&emsp;  │ │&emsp;  Client.java  
│&emsp;  │ │&emsp;  Coffee.java  
│&emsp;  │ │&emsp;  CoffeeStore.java  
│&emsp;  │ │&emsp;  LatteCoffee.java  
│&emsp;  │ │&emsp;  SimpleCoffeeFactory.java  
│&emsp;  │ │&emsp;  
│&emsp; │ └─static_factory  &emsp;//静态工厂模式  
│&emsp; │&emsp;      AmericanCoffee.java  
│&emsp; │&emsp;      Client.java  
│&emsp; │&emsp;      Coffee.java  
│&emsp; │&emsp;      CoffeeStore.java  
│&emsp; │&emsp;      LatteCoffee.java  
│&emsp; │&emsp;      SimpleCoffeeFactory.java  
│&emsp; │&emsp;        
│&emsp; └─prototype   &emsp;//原型模式   
│&emsp; │ ├─demo  
│&emsp; │&emsp;&emsp;  client.java  
│&emsp; │&emsp;&emsp;  Realizetype.java  
│&emsp; │&emsp;   
│&emsp; ├─test  
│&emsp; │&emsp;&emsp;  CitaionTest.java  
│&emsp; │&emsp;&emsp;  Citation.java  
│&emsp; │&emsp;&emsp;  Student.java  
│&emsp; │&emsp;   
│&emsp; └─test1  
│&emsp; │&emsp;&emsp;  CitaionTest.java  
│&emsp; │&emsp;&emsp;  Citation.java  
│&emsp; │&emsp;&emsp;  Student.java  
│    
│              
└─principles   &emsp;//设计原则  
&emsp;&emsp;├─demo1  &emsp;//开闭原则   
&emsp;&emsp;│&emsp;&emsp;  Client.java   
&emsp;&emsp;│&emsp;&emsp;  DefaultSkin.java   
&emsp;&emsp;│&emsp;&emsp;  HeimaSkin.java   
&emsp;&emsp;│&emsp;&emsp;  ougouInput.java   
&emsp;&emsp;│      
&emsp;&emsp;├─demo2  &emsp;//里氏代换原则   
&emsp;&emsp;│&emsp;├─after  &emsp;//使用里氏代换原则示例  
&emsp;&emsp;│&emsp;│&emsp;  Quadrilateral.java  
&emsp;&emsp;│&emsp;│&emsp;   Rectangle.java  
&emsp;&emsp;│&emsp;│&emsp;   RectangleDemo.java  
&emsp;&emsp;│&emsp;│&emsp;   Square.java  
&emsp;&emsp;│&emsp;│      
&emsp;&emsp;│&emsp;└─before  &emsp;//不使用示例  
&emsp;&emsp;│&emsp;│&emsp;  Rectangle.java   
&emsp;&emsp;│&emsp;│&emsp;  RectangleDemo.java   
&emsp;&emsp;│&emsp;│&emsp;   Square.java   
&emsp;&emsp;│          
&emsp;&emsp;├─demo3  &emsp;//依赖倒转原则  
&emsp;&emsp;│&emsp;├─after   &emsp;//使用依赖倒转原则示例  
&emsp;&emsp;│&emsp;│&emsp;  Computer.java  
&emsp;&emsp;│&emsp;│&emsp; ComputerDemo.java  
&emsp;&emsp;│&emsp;│&emsp;  Cpu.java  
&emsp;&emsp;│&emsp;│&emsp;  HardDisk.java  
&emsp;&emsp;│&emsp;│&emsp; IntelCpu.java  
&emsp;&emsp;│&emsp;│&emsp;  KingstonMemory.java  
&emsp;&emsp;│&emsp;│&emsp;  Memory.java  
&emsp;&emsp;│&emsp;│&emsp;  XiJieHardDisk.java   
&emsp;&emsp;│&emsp;│    
&emsp;&emsp;│&emsp;└─before   &emsp;//不使用示例  
&emsp;&emsp;│&emsp;│&emsp;   Computer.java   
&emsp;&emsp;│&emsp;│&emsp;  ComputerDemo.java   
&emsp;&emsp;│&emsp;│&emsp;   IntelCpu.java   
&emsp;&emsp;│&emsp;│&emsp;   KingstonMemory.java   
&emsp;&emsp;│&emsp;│&emsp;   XiJieHardDisk.java   
&emsp;&emsp;│          
&emsp;&emsp;├─demo4  &emsp;//接口隔离原则  
&emsp;&emsp;│&emsp;├─after    &emsp;//使用接口隔离原则示例  
&emsp;&emsp;│&emsp;│&emsp;   AntiTheft.java   
&emsp;&emsp;│&emsp;│&emsp;    Client.java   
&emsp;&emsp;│&emsp;│&emsp;   Fireproof.java   
&emsp;&emsp;│&emsp;│&emsp;   HeiMaSafetyDoor.java   
&emsp;&emsp;│&emsp;│&emsp;    ItcastSafetyDoor.java   
&emsp;&emsp;│&emsp;│&emsp;   Waterproof.java   
&emsp;&emsp;│&emsp;│      
&emsp;&emsp;│&emsp;└─before    &emsp;//不使用示例   
&emsp;&emsp;│&emsp;&emsp;&emsp;      Client.java   
&emsp;&emsp;│&emsp;&emsp;&emsp;     HeimaSafetyDoor.java   
&emsp;&emsp;│&emsp;&emsp;&emsp;   SafetyDoor.java   
&emsp;&emsp;│           
&emsp;&emsp;└─demo5  &emsp;//迪米特法则  
&emsp;&emsp;&emsp;&emsp;   Agent.java   
&emsp;&emsp;&emsp;&emsp;   Client.java   
&emsp;&emsp;&emsp;&emsp;  Company.java   
&emsp;&emsp;&emsp;&emsp;  Fans.java   
&emsp;&emsp;&emsp;&emsp;  Star.java   
