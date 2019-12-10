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

Multiple individual random number streams can be used, each with their own seed.  The syntax is

`rngs:set-seed <stream id> <seed>` 

with integers specified for both <stream id> and <seed> parameters.  An example is:
  
  `rngs:set-seed 1 100` - This defines stream 1 with a seed of 100

## Syntax
_Exponential Distribution_

Syntax: `rngs:rnd-exponential <stream id> <lambda>`

Notes: Lambda value can be non-integer (a double), but must be > 0

Example: `rngs:rnd-exponential 1 5`

_Gamma Distribution_
Syntax: `rngs:rnd-gamma <stream id> <alpha> <lambda>`
Notes: 
   *Alpha and Lambda values can be doubles, but must be > 0
   *for distribution to have mean 'x' and variance 'y', set parameters as follows:
         *alpha = (x*x)/y
         *lambda = 1/(y/x)

Example:  `rngs:rnd-gamma 1 .5 3.2`

  ;Normal distribution
  ;syntax --> rngs:rnd-norm <stream id> <mean> <std-dev>
  ;mean and std-dev can be doubles
  print word "Normal: "  rngs:rnd-norm 1 -3 .5

  ;Poisson distribution
  ;syntax --> rngs:rnd-poisson <stream id> <mean>
  ;mean can be a double, but must be > 0
  print word "Poisson: " rngs:rnd-poisson 1 2

  ;Uniform distribution
  ;syntax --> rngs:rnd-uniform <stream id> <lower bound> <upper bound>
  ;lower and upper bound can be doubles
  print word "Uniform: " rngs:rnd-uniform 1 3.2 6.5

  ;VonMises distribution
  ;syntax --> rngs:rnd-vm <stream id> <degrees of freedom>
  ;degrees of freedom can be a double, but must be > 0
  print word "VonMises: " rngs:rnd-vm 1 10.1

  ;Negative Binomial distribution
  ;syntax --> rngs:rnd-negbinomial <stream id> <# of trials> <p(success)>
  ;# of trials must be an integer, p(success) can be a double
  print word "Negative Binomial: " rngs:rnd-negbinomial 1 50 .25

  ;Beta distribution
  ;syntax --> rngs:rnd-beta <stream id> <alpha> <beta>
  ;alpha and beta parameters can be doubles, but must both be greater than 0
  print word "Beta: " rngs:rnd-beta 1 .5 5

end
