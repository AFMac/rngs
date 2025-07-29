import cern.jet.random.engine.MersenneTwister;
import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.PrimitiveManager;

import java.util.Hashtable;

public class RNGExtension extends DefaultClassManager {

	static Hashtable<Integer, MersenneTwister> RNGs = new Hashtable<Integer, MersenneTwister>(30);

    public void load(PrimitiveManager primitiveManager)
    {
    	primitiveManager.addPrimitive("init", new InitialiseCollection());
    	primitiveManager.addPrimitive("set-seed", new RNGSeed());
    	primitiveManager.addPrimitive("rnd-negbinomial", new NegBinomial());
        primitiveManager.addPrimitive("rnd-beta", new RandomBeta());
        primitiveManager.addPrimitive("rnd-vm", new RandomVM());
    }
}

/*
Copyright (c) 2025 Adam MacKenzie
Eliminating overlap based on expansion of distributions available in core NetLogo

Based on code that was:
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