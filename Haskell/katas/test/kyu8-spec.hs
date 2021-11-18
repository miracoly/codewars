module Main where

import Codewars.Kyu8

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test makeNegative" $ do
    it "makes positive Numbers negative" $ do
      makeNegative (1) `shouldBe` (-1)
      makeNegative (37) `shouldBe` (-37)
    it "do not change negativ number" $ do
      makeNegative (-9) `shouldBe` (-9)
      makeNegative (-921) `shouldBe` (-921)