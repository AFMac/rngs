import org.nlogo.api.*;
import cern.jet.random.Uniform;

public class RandomUniform extends DefaultReporter
{

    public Syntax getSyntax()
    {
	   int[] right = new int[] { Syntax.NumberType(), Syntax.NumberType(), Syntax.NumberType() };
	   int ret = Syntax.NumberType();
	   return Syntax.reporterSyntax( right, ret );
    }

    public Object report(Argument args[], Context context)  throws ExtensionException
    {
		try {
			int key = args[0].getIntValue(); /*stream-id*/
			double rangeLow = args[1].getDoubleValue(); /*interval FROM */
                        double rangeHigh = args[2].getDoubleValue(); /* interval TO */
                        Uniform u = new Uniform(rangeLow, rangeHigh,RNGExtension.RNGs.get(key));
			return u.nextDouble();
		} catch (Exception e) {
			System.out.println("Something went wrong in RandomUniform: " + e.toString());
		}
		return 0f;
    }
}

/*
Copyright (c) 2007 David O'Sullivan

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
*/