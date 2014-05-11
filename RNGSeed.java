import org.nlogo.api.*;
import java.util.Date;
import cern.jet.random.engine.MersenneTwister;
import java.lang.*;

public class RNGSeed extends DefaultCommand
{
    public Syntax getSyntax()
    {
	   int[] right = new int[] { Syntax.NumberType(), Syntax.NumberType() };
	   return Syntax.commandSyntax( right );
    }

    public void perform(Argument args[], Context context) throws ExtensionException
    {
		try {
			int key =  args[0].getIntValue();
			int seed = args[1].getIntValue();
			if (seed == 0) {
				RNGExtension.RNGs.put(key, new MersenneTwister(new Date()));
			} else {
				RNGExtension.RNGs.put(key, new MersenneTwister(seed));
			}
		} catch (Exception e) {
			System.out.println("Something went wrong in RNGSeed: " + e.toString());
			System.out.println("The rng collection: " + RNGExtension.RNGs.toString());
		}
    }
}

/*
Copyright (c) 2007 David O'Sullivan

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