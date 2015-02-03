package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not zero/not equal (ZF=1)
// Category: general/datamov

object SETNE extends InstructionDefinition("SETNE") with SETNEImpl

trait SETNEImpl {
  implicit object SETNE_0 extends SETNE._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x95) /+ 0
  }
}
