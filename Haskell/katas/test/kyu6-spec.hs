module Main where

import Codewars.Kyu6

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test getCount" $ do
    it "returns correct count" $ do
