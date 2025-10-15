import unittest
from main import greet

class TestGreetFunction(unittest.TestCase):
    def test_greet_hello(self):
        self.assertEqual(greet(1), "Hello")

    def test_greet_goodbye(self):
        self.assertEqual(greet(0), "Goodbye")

if __name__ == '__main__':
    unittest.main()
