assumptions-

taxi stand can have at max 10 taxis
person directly enters person queue(to make it fair for already waiting persons)
However to implement person generation and checking directly uncomment the lines in the code.

persons generate every 3 seconds,taxi generates every 10 seconds, persons checks for taxis every 3 seconds
(implemented using Scheduled executor service)

threads for generating person,generating taxi
threads for taxi queue and person queue
