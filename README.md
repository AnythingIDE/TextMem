# TextMem

TextMem is a simple interface to define access to a buffer of text.
As buffer implementations are not guaranteed to store their data on the
same machine as the client, TextMem makes use of ReactiveStreams.