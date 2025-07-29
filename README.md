rngs
====
Random Number Generator extension for NetLogo
This extension allows for the definition of multiple independent streams of random numbers as well as an expansion of available discrete and continuous distributions.
Function of the extension requires the colt.jar library (distributed with the extension), placed in the 'rngs' extension folder. Visit https://dst.lbl.gov/ACSSoftware/colt/ for additional information on the library.

USAGE
Given the inclusion of other random distributions (Uniform, Gamma, Binomial, Poisson, etc.) in the core functionality of NetLogo, this extension has been revised to avoid overlap and now includes the following additional random distributions:
- Beta
- Negative Binomial
- Von Mises

Prior to first use, the extension must be initialized using the rngs:init command. It is recommended this be placed into a "setup" type routine before your model is run.
Multiple individual random number streams can be used, each with their own seed. The syntax is rngs:set-seed <stream id> <seed> with integers specified for both and parameters. As an example, rngs:set-seed 1 100 defines stream 1 with a seed of 100

Syntax
VonMises Distribution
Syntax: rngs:rnd-vm <stream id> <degrees of freedom>
Notes: <degrees of freedom> can be a double, but must be > 0
Example: rngs:rnd-vm 1 10.1

Negative Binomial Distribution
Syntax: rngs:rnd-negbinomial <stream id> <# of trials> <p(success)>
Notes: <# of trials> must be an integer, <p(success)> can be a double
Example: rngs:rnd-negbinomial 1 50 .25

Beta Distribution
Syntax: rngs:rnd-beta <stream id> <alpha> <beta>
Notes: <alpha> and <beta> parameters can be doubles, but must both be greater than 0
Example: rngs:rnd-beta 1 .5 5
