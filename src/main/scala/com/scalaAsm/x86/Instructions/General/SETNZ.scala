package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not zero/not equal (ZF=1)
// Category: general/datamov

object SETNZ extends InstructionDefinition("SETNZ") with SETNZImpl

trait SETNZImpl {
  implicit object SETNZ_0 extends SETNZ._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x95) /+ 0
  }
}
