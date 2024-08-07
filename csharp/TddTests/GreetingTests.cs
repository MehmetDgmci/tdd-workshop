using Tdd;

namespace TddTests;

public class GreetingTests
{
    [Test]
    public void ShouldGetHelloWorld()
    {
        Assert.That(Greeting.Get(), Is.EqualTo("Hello, World!"));
    }
}
