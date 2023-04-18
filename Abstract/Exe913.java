interface Transport
{
	void deliver();
}

abstract class Animal{}

class Tiger extends Animal{}
class Donkey extends Animal implements Transport{}
class Camel extends Animal implements Transport{}
class Deer extends Animal{}




