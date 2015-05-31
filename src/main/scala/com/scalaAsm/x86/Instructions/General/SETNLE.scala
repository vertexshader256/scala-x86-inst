package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/datamov

trait SETNLE extends InstructionDefinition {
  val mnemonic = "SETNLE"
}

object SETNLE extends OneOperand[SETNLE] with SETNLEImpl

trait SETNLEImpl extends SETNLE {
  implicit object SETNLE_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9F) /+ 0
    val format = RmFormat
    val hasRMByte = true
  }
}
