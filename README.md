rngs
====

Random Number Generator extension for NetLogo

; **REQUIRED FOR USAGE***
; Users must include the colt.jar library.  Visit https://acs.lbl.gov/software/colt/ to 
; download the package, and include this .jar file in the 'rngs' extension folder.

; INITIALIZATION
; Good rule of thumb to start with an init using the 'rngs:init' command.
; Afterwards, define your seed(s) for each random number stream.  Multiple streams can
; be defined, each with its own seed, allowing for different streams of numbers to be 
; assigned to different stochastic processes within your model.  It is unknown how many
; streams can be defined.  Command is:

;          rngs: set-seed <stream id> <seed value>
; NOTE: The "<" and ">" characters are not required, but are included to delineate 
; areas where you will insert your own values.  Both the stream ID and seed must be
; integers.

; USAGE
; This extension includes the following random distributions:
; Beta
; Exponential
; Gamma
; Negative Binomial
; Normal
; Poisson
; Uniform
; Von Mises

; ** Beta
; Command:  rngs:rnd-beta <stream-id> <alpha> <beta>
; Outputs a double from a beta distribution with user-defined alpha and beta parameters
;   <stream-id> must be an integer, and one of the user-instantiated random # streams
;   <alpha> must be > 0, and may be a double
;   <beta> must be > 0, and may be a double

; ** Exponential
; Command:  rngs:rnd-exponential <stream-id> <mean>
; Outputs a double from an exponential distribution with user-defined mean (lambda)
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <mean> must be > 0

; ** Gamma
; Command:  rngs:rnd-gamma <stream-id> <alpha> <lambda>
; Outputs a double from a gamma distribution with user-defined alpha and lambda
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <alpha> and <lambda> must be > 0 and are both accepted as doubles
;    Note: to construct a gamma distribution with mean 'm' and variance 'v', set the
;    parameters as follows:
;      alpha  = m*m/v
;      lambda = 1/(v/m)

; ** Negative Binomial
; Command:  rngs:rnd-negbinomial <stream-id> <trials> <p(success)>
; Outputs a double driven from a negative binomial with user defined number of trials and
; probability of success
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <trials> must be an integer and > 0
;    <p(success)> is a double on the interval [0,1]    

; ** Normal
; Command:  rngs:rnd-norm <stream-id> <mean> <std-deviation>
; Outputs a double pulled from a normal distribution with defined mean and standard dev.
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <mean> and <std-deviation> are both doubles

; ** Poisson
; Command:  rngs:rnd-poisson <stream-id> <mean>
; Outputs a double pulled from a poisson distribution with user-defined mean
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <mean> must be > 0

; ** Uniform
; Command:  rngs:rnd-uniform <stream-id> <interval min> <interval max>
; Outputs a double pulled from a uniform distribution defined on a user-defined interval
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <interval min> and <interval max> are both doubles

; ** VonMises
; Command:  rngs:rnd-vm <stream-id> <freedom>
; Outputs a double pulled from a VonMises distribution with user-defined parameter
;    <stream-id> must be an integer, and one of the user-instantiated random # streams
;    <freedom> is a double and must be > 0
