package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if less or equal/not greater ((ZF=1) OR (SF!=OF))
// Category: general/branch/cond

object JNG extends InstructionDefinition("JNG") with JNGImpl

trait JNGImpl {
  implicit object JNG_0 extends JNG._1[rel8] {
    val opcode: OneOpcode = 0x7E
  }

  implicit object JNG_1 extends JNG._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
  }

  implicit object JNG_2 extends JNG._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8E)
  }
}
