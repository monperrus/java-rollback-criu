Checkpoint and rollback in Java with Criu
-----------------------------------------








How to run criu on Travis?
--------------------------

The idea is to install criu from Ubuntu sources using apt-src:

```
sudo: required
dist: trusty

# installing criu
install:
  - sudo apt-get install apt-src python-ipaddr python-protobuf
  # -s is required for installing from sources
  - sudo add-apt-repository -s 'deb http://archive.ubuntu.com/ubuntu/ xenial main universe multiverse' -y
  - sudo apt-get update
  - sudo apt-src --build install criu
  - sudo dpkg -i criu_*.deb

```
