import org.nlogo.api.*;
import cern.jet.random.*;

public class NegBinomial extends DefaultReporter
{

	//Use:  rngs:rnd-negbinomial <stream-id> <trials> <p(success)>
	//<trials> is the number of trials
	//p(success) is the probability of success

    public Syntax getSyntax()
    {
	   int[] right = new int[] { Syntax.NumberType(), Syntax.NumberType(), Syntax.NumberType() };
	   int ret = Syntax.NumberType();
	   return Syntax.reporterSyntax( right, ret );
    }

    public Object report(Argument args[], Context context)  throws ExtensionException
    {
		try {
			int key = args[0].getIntValue();
			int trials = args[1].getIntValue();
			double success = args[2].getDoubleValue();
			NegativeBinomial dist = new NegativeBinomial(trials, success, RNGExtension.RNGs.get(key));
			return dist.nextDouble();
		} catch (Exception e) {
			System.out.println("Something went wrong in NegBinomial: " + e.toString());
		}
		return 0f;
    }
}

/*
Copyright (c) 2009 Adam MacKenzie
Portions of code Copyright (c) 2007 David O'Sullivan

Packages cern.colt* , cern.jet*, cern.clhep

Copyright (c) 1999 CERN - European Organization for Nuclear Research.
Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose is hereby granted without fee, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation. CERN makes no representations about the suitability of this software for any purpose. It is provided "as is" without expressed or implied warranty.


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
