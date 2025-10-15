import unittest
from io import StringIO
import sys
from main import greet

class TestGreetFunction(unittest.TestCase):

    def test_greet_hello(self):
        captured_output = StringIO()
        sys.stdout = captured_output
        greet(1)
        sys.stdout = sys.__stdout__
        self.assertEqual(captured_output.getvalue().strip(), "Hello")

    def test_greet_goodbye(self):
        captured_output = StringIO()
        sys.stdout = captured_output
        greet(0)
        sys.stdout = sys.__stdout__
        self.assertEqual(captured_output.getvalue().strip(), "Goodbye")

if __name__ == '__main__':
    unittest.main()
