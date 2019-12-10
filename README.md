# rngs
====

## Random Number Generator extension for NetLogo

This extension allows for the definition of multiple independent streams of random numbers as well as an expansion of available discrete and continuous distributions.  

Function of the extension requires the colt.jar library (distributed with the extension), placed in the 'rngs' extension folder.  Visit https://acs.lbl.gov/software/colt/ for additional information on the library.

## USAGE
This extension includes the following random distributions:

  * Beta
  * Exponential
  * Gamma
  * Negative Binomial
  * Normal
  * Poisson
  * Uniform
  * Von Mises

Prior to first use, the extension must be initialized using the `rngs:init` command.  It is recommended this be placed into a "setup" type routine before your model is run.

Multiple individual random number streams can be used, each with their own seed.  The syntax is `rngs:set-seed <stream id> <seed>` 
with integers specified for both <stream id> and <seed> parameters.  As an example, `rngs:set-seed 1 100` defines stream 1 with a seed of 100

## Syntax
_Exponential Distribution_

* Syntax: `rngs:rnd-exponential <stream id> <lambda>`
* Notes: Lambda value can be non-integer (a double), but must be > 0
* Example: `rngs:rnd-exponential 1 5`

_Gamma Distribution_
* Syntax: `rngs:rnd-gamma <stream id> <alpha> <lambda>`
* Notes: 
   * Alpha and Lambda values can be doubles, but must be > 0
   * for distribution to have mean 'x' and variance 'y', set parameters as follows:
     * alpha = (x*x)/y
     * lambda = 1/(y/x)
   * Example:  `rngs:rnd-gamma 1 .5 3.2`

_Normal distribution_
* Syntax: `rngs:rnd-norm <stream id> <mean> <std-dev>`
* Notes: `<mean>` and `<std-dev>` can be doubles
* Example: `rngs:rnd-norm 1 -3 .5`

_Poisson Distribution_
* Syntax: `rngs:rnd-poisson <stream id> <mean>`
* Notes: `<mean>` can be a double, but must be > 0
* Example: `rngs:rnd-poisson 1 2`

_Uniform Distribution_
* Syntax: `rngs:rnd-uniform <stream id> <lower bound> <upper bound>`
* Notes: lower and upper bound figures can be doubles
* Example: `rngs:rnd-uniform 1 3.2 6.5`

_VonMises Distribution_
* Syntax: `rngs:rnd-vm <stream id> <degrees of freedom>`
* Notes: `<degrees of freedom>` can be a double, but must be > 0
* Example: `rngs:rnd-vm 1 10.1`

_Negative Binomial Distribution_
* Syntax: `rngs:rnd-negbinomial <stream id> <# of trials> <p(success)>`
* Notes: `<# of trials>` must be an integer, `<p(success)>` can be a double
* Example: `rngs:rnd-negbinomial 1 50 .25`

_Beta Distribution_
* Syntax: `rngs:rnd-beta <stream id> <alpha> <beta>`
* Notes: `<alpha>` and `<beta>` parameters can be doubles, but must both be greater than 0
* Example: `rngs:rnd-beta 1 .5 5`

